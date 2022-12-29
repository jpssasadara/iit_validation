package com.iit.repository;

import com.iit.model.Voter;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface VoterRepository extends MongoRepository<Voter,String> {

}
