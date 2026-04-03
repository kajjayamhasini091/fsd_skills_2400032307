package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Invoice;
import com.klef.fsad.exam.repository.InvoiceRepository;

@Service
public class InvoiceService 
{
	@Autowired
	InvoiceRepository repository;

	public Invoice addInvoice(Invoice invoice)
	{
		return repository.save(invoice);
	}

	public List<Invoice> getInvoices()
	{
		return repository.findAll();
	}
}