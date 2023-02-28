package bankproject.onlinebanking.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import bankproject.onlinebanking.Model.Beneficiaries;
import bankproject.onlinebanking.Service.BeneficiariesService;

@RestController
@RequestMapping("/beneficiaries")
public class BeneficiaryController {

    @Autowired
    private BeneficiariesService beneficiariesService;

    @PostMapping("/add")
    public ResponseEntity<Beneficiaries> createBeneficiary(@RequestBody Beneficiaries beneficiary) {
        Beneficiaries newBeneficiary = beneficiariesService.createBeneficiary(beneficiary);
        return new ResponseEntity<>(newBeneficiary, HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Beneficiaries>> getAllBeneficiaries() {
        List<Beneficiaries> beneficiaries = beneficiariesService.getAllBeneficiaries();
        return new ResponseEntity<>(beneficiaries, HttpStatus.OK);
    }

    @GetMapping("/getabn/{beneficiaryId}")
    public ResponseEntity<Beneficiaries> getBeneficiaryById(@PathVariable int beneficiaryId) {
        Beneficiaries beneficiary = beneficiariesService.getBeneficiaryById(beneficiaryId);
        return new ResponseEntity<>(beneficiary, HttpStatus.OK);
    }

    @PutMapping("/updateabn")
    public ResponseEntity<Beneficiaries> updateBeneficiary(@RequestBody Beneficiaries beneficiary) {
        Beneficiaries updatedBeneficiary = beneficiariesService.updateBeneficiary(beneficiary);
        return new ResponseEntity<>(updatedBeneficiary, HttpStatus.OK);
    }

    @DeleteMapping("/deleteabn/{beneficiaryId}")
    public ResponseEntity<Void> deleteBeneficiary(@PathVariable int beneficiaryId) {
        beneficiariesService.deleteBeneficiary(beneficiaryId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<Optional<Beneficiaries>> getBeneficiariesByUserId(@PathVariable int userId) {
        Optional<Beneficiaries> beneficiaries = beneficiariesService.getBeneficiariesByUserId(userId);
        return new ResponseEntity<>(beneficiaries, HttpStatus.OK);
    }
}