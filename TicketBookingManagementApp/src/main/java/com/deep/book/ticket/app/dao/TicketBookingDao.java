package com.deep.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;


import com.deep.book.ticket.app.entities.Ticket;
/**
 * @author Amardeep Kumar
 */
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
