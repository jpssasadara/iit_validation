package com.iit.controller;

import com.iit.model.Voter;
import com.iit.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/voters")
public class VoterController {

    @Autowired
    private VoterService voterService;

    @GetMapping("/{voterId}/status")
    public String getVoterStatusByNic(@PathVariable String voterId ){
        Voter vote =  voterService.getVoterByVoterId(voterId);
        if (vote != null && vote.getAge() > 0){
            if(vote.getAge() > 18){
                return "Eligible";
            }else{
                return "Not Eligible";
            }
        }else{
            return "Not Eligible";
        }
    }

}
