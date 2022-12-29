package com.iit.service;

import com.iit.model.Voter;
import com.iit.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoterService {

    @Autowired
    private VoterRepository voterRepository;

    public Voter addVoter(Voter voter){
        return voterRepository.save(voter);
    }

    public List<Voter> findAllVoters(){
        return voterRepository.findAll();
    }

    public Voter getVoterByVoterId(String nic){
        return voterRepository.findById(nic).get();
    }
}
