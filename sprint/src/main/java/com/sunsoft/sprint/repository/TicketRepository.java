package com.sunsoft.sprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sunsoft.sprint.entity.Ticket;


@Repository

public interface TicketRepository extends  CrudRepository<Ticket, Integer>  {

}
