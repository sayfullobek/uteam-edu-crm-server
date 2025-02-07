package uteam_edu_crm.uteam_edu_crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import uteam_edu_crm.uteam_edu_crm.entity.Country;
import uteam_edu_crm.uteam_edu_crm.entity.Region;
import uteam_edu_crm.uteam_edu_crm.payload.ReqRegion;
import uteam_edu_crm.uteam_edu_crm.payload.ResRegion;
import uteam_edu_crm.uteam_edu_crm.repository.CountryRepository;
import uteam_edu_crm.uteam_edu_crm.repository.RegionRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import uteam_edu_crm.uteam_edu_crm.payload.ApiResponse;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionRepository regionRepository;

    private final CountryRepository countryRepository;

    public ApiResponse addRegion(ReqRegion reqRegion) {
        Country country = countryRepository.findById(reqRegion.getCountryId())
                .orElseThrow(() -> new ResourceNotFoundException("getCountryError"));
        Region region = new Region();
        region.setNameUz(reqRegion.getNameUz());
        region.setNameRu(reqRegion.getNameRu());
        region.setCountry(country);
        regionRepository.save(region);
        return new ApiResponse("Muvaffaqiyatli qo`shildi!", true);
    }

    public List<ResRegion> getAllRegions() {
        return regionRepository.findAll().stream()
                .map(region -> new ResRegion(region.getId(), region.getNameUz(), region.getNameRu(),
                        region.getCountry().getId()))
                .collect(Collectors.toList());
    }

    public ApiResponse editRegion(Integer id, ReqRegion reqRegion) {
        Country country = countryRepository.findById(reqRegion.getCountryId())
                .orElseThrow(() -> new ResourceNotFoundException("getCountryError"));
        Optional<Region> optionalRegion = regionRepository.findById(id);
        if (optionalRegion.isPresent()) {
            Region region = optionalRegion.get();
            region.setNameUz(reqRegion.getNameUz());
            region.setNameRu(reqRegion.getNameRu());
            region.setCountry(country);
            regionRepository.save(region);
            return new ApiResponse("Muvaffaqiyatli taxrirlandi!", true);
        }
        return new ApiResponse("Region topilmadi!", false);
    }

    public ApiResponse deleteRegion(Integer id) {
        if (regionRepository.existsById(id)) {
            regionRepository.deleteById(id);
            return new ApiResponse("Muvaffaqiyatli o`chirildi!", true);
        }
        return new ApiResponse("Region topilmadi!", false);
    }
}
