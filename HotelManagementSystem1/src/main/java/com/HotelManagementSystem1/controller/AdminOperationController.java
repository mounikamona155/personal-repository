package com.HotelManagementSystem1.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import com.revature.hotelmanagementsystem.bean.BookingInformationBean;
import com.revature.hotelmanagementsystem.exception.HotelManagementSystemException;
import com.hotelmanagementsystem1.response.HotelManagement1Response;

public class AdminOperationController {
	@GetMapping(path="/getBookingHistoryForAdmin" , produces = MediaType.APPLICATION_JSON_VALUE)
	public HotelManagementResponse getBookingHistory() {
		HotelManagementResponse response = new HotelManagementResponse();
	//	try {
			List<BookingInformationBean> bookingDetails = adminOperationsService.getBookingHistory();
			if (bookingDetails != null && !bookingDetails.isEmpty()) {
				response.setStatusCode(200);
				response.setMessage("Success");
				response.setDescription("Booking details list displayed");
				response.setBookingDetailsList(bookingDetails);
				;
			} else {
//				response.setStatusCode(400);
//				response.setMessage("Failed");
//				response.setDescription("Booking details can't be fetched");
				throw new HotelManagementSystemException("Booking details can't be fetched");
			}
	//	} catch (Exception e) {
//			response.setStatusCode(400);
//			response.setMessage("Failed");
//			response.setDescription(e.getMessage());
//			System.out.println(e.getMessage());
//		}
		return response;		
	}
}
