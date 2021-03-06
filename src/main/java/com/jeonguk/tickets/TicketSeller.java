package com.jeonguk.tickets;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

// 1
//    public TicketOffice getTicketOffice() {
//        return ticketOffice;
//    }

// 2
//    public void sellTo(Audience audience) {
//        if (audience.getBag().hasInvitation()) {
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().setTicket(ticket);
//        } else {
//            Ticket ticket = ticketOffice.getTicket();
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketOffice.plusAmount(ticket.getFee());
//            audience.getBag().setTicket(ticket);
//        }
//    }

    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
