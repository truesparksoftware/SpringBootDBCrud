package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankDataController {

	@GetMapping("/getbank")
	// @RequestMapping(value="/getbank",method = RequestMethod.GET)
	public BankData getBankDetails() {
		BankData b1 = new BankData("101", "ICICI", "Pune");
		return b1;

	}

	@GetMapping("/allbank")
	public List<BankData> getListBank() {
		BankData b1 = new BankData("101", "ICICI", "Pune");
		BankData b2 = new BankData("102", "HDFC", "Pune");
		BankData b3 = new BankData("103", "AXIS", "Pune");
		BankData b4 = new BankData("104", "YES", "Pune");
		BankData b5 = new BankData("105", "KOTAK", "Pune");
		List<BankData> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		return list;
	}

	@GetMapping("/bankbyid/{id}")
	public BankData getBankById(@PathVariable String id) {
		BankData b1 = new BankData("101", "ICICI", "Pune");
		BankData b2 = new BankData("102", "HDFC", "Pune");
		BankData b3 = new BankData("103", "AXIS", "Pune");
		BankData b4 = new BankData("104", "YES", "Pune");
		BankData b5 = new BankData("105", "KOTAK", "Pune");
		List<BankData> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		BankData res = null;

		for (BankData b : list) {
			if (b.getId().equals(id)) {
				res = b;
			}
		}

		return res;
	}

	@GetMapping("/bankbyidname/{id}/{name}")
	public List<BankData> getBankByIdName(@PathVariable String id, @PathVariable String name) {
		BankData b1 = new BankData("101", "ICICI", "Pune");
		BankData b2 = new BankData("102", "HDFC", "Pune");
		BankData b3 = new BankData("103", "AXIS", "Pune");
		BankData b4 = new BankData("104", "YES", "Pune");
		BankData b5 = new BankData("105", "KOTAK", "Pune");
		List<BankData> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		List<BankData> resultList = new ArrayList<BankData>();

		for (BankData b : list) {
			if (b.getId().equals(id) || b.getName().equals(name)) {
				resultList.add(b);
			}
		}

		return resultList;
	}

	@PostMapping("/creatbank")
	public BankData createBank(@RequestBody BankData bank) {
		System.out.println(bank);
		BankData ba = new BankData();
		ba.setId(bank.getId());
		ba.setName(bank.getName());
		ba.setLoc(bank.getLoc());
		return ba;
	}

	@PutMapping("/updatebank/{id}")
	public List<BankData> updateBank(@PathVariable String id, @RequestBody BankData bank) {
		BankData b1 = new BankData("101", "ICICI", "Pune");
		BankData b2 = new BankData("102", "HDFC", "Pune");
		BankData b3 = new BankData("103", "AXIS", "Pune");
		BankData b4 = new BankData("104", "YES", "Pune");
		BankData b5 = new BankData("105", "KOTAK", "Pune");
		List<BankData> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		for (BankData bnk : list) {
			if (bnk.getId().equals(id)) {
				bnk.setId(bank.getId());
				bnk.setName(bank.getName());
				bnk.setLoc(bank.getLoc());
			}
		}

		return list;
	}

	@DeleteMapping("/deletebank/{id}")
	public List<BankData> deleteBank(@PathVariable String id) {
		BankData b1 = new BankData("101", "ICICI", "Pune");
		BankData b2 = new BankData("102", "HDFC", "Pune");
		BankData b3 = new BankData("103", "AXIS", "Pune");
		BankData b4 = new BankData("104", "YES", "Pune");
		BankData b5 = new BankData("105", "KOTAK", "Pune");
		List<BankData> list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		List<BankData> list1 = new ArrayList();

		for (BankData bnk : list) {
			if (bnk.getId().equals(id)) {

			} else {
				list1.add(bnk);
			}
		}

		return list1;
	}

}
