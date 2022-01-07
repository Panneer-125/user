package security.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.ReportEntity;
import security.user.entity.ReturnEntity;
import security.user.model.Report;
import security.user.model.Return;
import security.user.repository.ReturnRepository;

@Service
public class ReturnServiceImpl implements ReturnService{
@Autowired
ReturnRepository returnRepository;
	@Override
	public Return saveReturn(Return returns) {
		ReturnEntity r=new ReturnEntity();
		r.setBillValue(returns.getBillValue());
		r.setCheckedBy(returns.getCheckedBy());
		r.setDateDelivery(returns.getDateDelivery());
		r.setInvoiceNo(returns.getInvoiceNo());
		r.setQuanity(returns.getQuanity());
		r.setReceiptNo(returns.getReceiptNo());
		r.setReturnedBy(returns.getReturnedBy());
		returnRepository.save(r);
		return returns;
	}

	@Override
	public Return getReturn(int godownId) {
		ReturnEntity r=returnRepository.getById(godownId);
		Return r1=new Return();
		r1.setBillValue(r.getBillValue());
		r1.setCheckedBy(r.getCheckedBy());
		r1.setDateDelivery(r.getDateDelivery());
		r1.setInvoiceNo(r.getInvoiceNo());
		r1.setQuanity(r.getQuanity());
		r1.setReceiptNo(r.getReceiptNo());
		r1.setReturnedBy(r.getReturnedBy());
		return r1;
	}

	@Override
	public List<Return> getAllReturn() {
		List<Return> r=new ArrayList<Return>();
		List<ReturnEntity>r1=returnRepository.findAll();
		for(ReturnEntity returnEntity:r1) {
			Return r2=new Return();
			r2.setBillValue(returnEntity.getBillValue());
			r2.setCheckedBy(returnEntity.getCheckedBy());
			r2.setDateDelivery(returnEntity.getDateDelivery());
			r2.setInvoiceNo(returnEntity.getInvoiceNo());
			r2.setQuanity(returnEntity.getQuanity());
			r2.setReceiptNo(returnEntity.getReceiptNo());
			r2.setReturnedBy(returnEntity.getReturnedBy());
		    r.add(r2);
		}
		return r;
	}

	@Override
	public void deleteReturn(int godownId) {
		returnRepository.deleteById(godownId);
		
	}

}
