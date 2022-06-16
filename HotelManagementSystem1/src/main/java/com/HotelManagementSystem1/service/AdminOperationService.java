package com.HotelManagementSystem1.service;

import java.util.List;

import com.HotelManagementSystem1.bean.AdminEmployeeUserBean;
import com.HotelManagementSystem1.bean.BookingInformationBean;
import com.HotelManagementSystem1.bean.EmployeeInformationBean;
import com. HotelManagementSystem1.bean.HotelInformationBean;
import com.HotelManagementSystem1.bean.RoomInformationBean;

public interface AdminOperationService {
	

	public List<BookingInformationBean> getBookingHistory();
}// end of interface
