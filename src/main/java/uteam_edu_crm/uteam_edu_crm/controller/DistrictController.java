package uteam_edu_crm.uteam_edu_crm.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import uteam_edu_crm.uteam_edu_crm.payload.ApiResponse;
import uteam_edu_crm.uteam_edu_crm.payload.ReqRegion;
import uteam_edu_crm.uteam_edu_crm.service.DistrictService;
import uteam_edu_crm.uteam_edu_crm.service.RegionService;

@RestController
@RequestMapping("/region")
@CrossOrigin
@RequiredArgsConstructor
public class DistrictController {
    
    private final DistrictService districtService;

    @PostMapping
    public HttpEntity<?> addRegion(@RequestBody ReqRegion reqRegion) {
        ApiResponse apiResponse = districtService.addDistri(reqRegion);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @GetMapping("/list")
    public HttpEntity<?> getRegions() {
        return ResponseEntity.ok(districtService.getAllRegions());
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editRegion(@PathVariable Integer id, @RequestBody ReqRegion reqRegion) {
        ApiResponse apiResponse = districtService.editRegion(id, reqRegion);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteRegion(@PathVariable Integer id) {
        ApiResponse apiResponse = districtService.deleteRegion(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }
}
