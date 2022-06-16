package com.HotelManagementSystem1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelManagementSystem1.bean.BookingInformationBean;
import com.HotelManagementSystem1.bean.EmployeeInformationBean;
import com.HotelManagementSystem1.bean.HotelInformationBean;

@Service
public class AdminOperationServiceImpl implements AdminOperationService {

	@Autowired
	private AdminOperationDao adminOperationsDao;
	


	@Override
	public List<BookingInformationBean> getBookingHistory() {
		return bookingOperationDAO.findAll();
	}
}// end of class
