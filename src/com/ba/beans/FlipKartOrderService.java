package com.ba.beans;

import java.util.List;

public class FlipKartOrderService {
	ParcelService blueDartParcelService;
	ParcelService dtdcParcelService;

	public void order(List product, String address) {
		String awb = null;
		awb = ParcelService.parcel(product, address);
		System.out.println(awb);
	}

	public void setBlueDartParcelService(ParcelService blueDartParcelService) {
		this.blueDartParcelService = blueDartParcelService;
	}

	public void setDtdcParcelService(ParcelService dtdcParcelService) {
		this.dtdcParcelService = dtdcParcelService;
	}


}
