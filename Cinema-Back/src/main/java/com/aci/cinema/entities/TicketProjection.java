package com.aci.cinema.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj", types= {com.aci.cinema.entities.Ticket.class})
public interface TicketProjection {
	public Long getId();
	public String getNomClient();
	public double getPrix();
	public Integer getCodePayement();
	public boolean getReserve();
	public Place getPlace();
}
