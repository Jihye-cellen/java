package sale;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import product.ProductVO;


public class SaleVO extends ProductVO{
	private int seq;
	private String code;
	private String sale_date;
	private int qnt;
	
	
	
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	@Override
	public String toString() {
		DecimalFormat df =new DecimalFormat("#,###원");
		String fmtPrice=df.format(getPrice());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String fmtDate = sdf.format(sale_date);
		int sum=getPrice()*qnt;
		String fmtSum= df.format(sum);
		return "SaleVO [ code=" + code + ", 판매일=" + getSale_date() + ", 수량=" + qnt + ", 제품명=" + getName()
				+ ", 가격=" + fmtPrice + ", 상품금액=" +fmtSum ;
	}
	
	
	
}
