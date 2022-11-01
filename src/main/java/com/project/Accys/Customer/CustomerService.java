package com.project.Accys.Customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public List<Customer> getCustomers(){
		return List.of(new Customer(1l,
				"Bwbw",
				12,
				"asd",
				LocalDate.of(2000, Month.JANUARY, 5)
				)
				);
	}
}
