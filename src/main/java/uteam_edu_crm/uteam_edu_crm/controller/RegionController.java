package uteam_edu_crm.uteam_edu_crm.controller;

import uteam_edu_crm.uteam_edu_crm.payload.ApiResponse;
import uteam_edu_crm.uteam_edu_crm.payload.ReqRegion;
import uteam_edu_crm.uteam_edu_crm.service.RegionService;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/region")
@CrossOrigin
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @PostMapping
    public HttpEntity<?> addRegion(@RequestBody ReqRegion reqRegion) {
        ApiResponse apiResponse = regionService.addRegion(reqRegion);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @GetMapping("/list")
    public HttpEntity<?> getRegions() {
        return ResponseEntity.ok(regionService.getAllRegions());
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editRegion(@PathVariable Integer id, @RequestBody ReqRegion reqRegion) {
        ApiResponse apiResponse = regionService.editRegion(id, reqRegion);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteRegion(@PathVariable Integer id) {
        ApiResponse apiResponse = regionService.deleteRegion(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }
}
