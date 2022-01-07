package security.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.InwardsEntity;
import security.user.model.Inwards;
import security.user.repository.InwardsRepository;

@Service
public class InwardsServiceImpl implements InwardsService{
@Autowired
InwardsRepository inwardsRepository;
	@Override
	public Inwards saveInwards(Inwards inwards) {
		InwardsEntity e=new InwardsEntity();
		e.setInvoiceNo(inwards.getInvoiceNo());
		e.setItemName(inwards.getItemName());
		e.setQuantity(inwards.getQuantity());
		e.setReceivedBy(inwards.getReceivedBy());
		e.setReceiptNo(inwards.getReceiptNo());
		e.setSupplyDate(inwards.getSupplyDate());
		e.setSupplierName(inwards.getSupplierName());
		inwardsRepository.save(e);
		return inwards;
	}

	@Override
	public Inwards getInwards(int godownId) {
		InwardsEntity g=inwardsRepository.getById(godownId);
		Inwards i=new Inwards();
		i.setInvoiceNo(g.getInvoiceNo());
		i.setItemName(g.getItemName());
		i.setQuantity(g.getQuantity());
		i.setReceiptNo(g.getReceiptNo());
		i.setSupplyDate(g.getSupplyDate());
		i.setSupplierName(g.getSupplierName());
		i.setReceivedBy(g.getReceivedBy());

		return i;
	}

	@Override
	public List<Inwards> getAllInwards() {
		List<Inwards> i = new ArrayList<Inwards>();
		List<InwardsEntity> inwardsEntityList= inwardsRepository.findAll();
		
		for(InwardsEntity inwardsEntity : inwardsEntityList) {
			Inwards n = new Inwards();
			n.setInvoiceNo(inwardsEntity.getInvoiceNo());
			n.setItemName(inwardsEntity.getItemName());
			n.setReceivedBy(inwardsEntity.getReceivedBy());
			n.setQuantity(inwardsEntity.getQuantity());
			n.setReceiptNo(inwardsEntity.getReceiptNo());
			n.setSupplyDate(inwardsEntity.getSupplyDate());
			n.setSupplierName(inwardsEntity.getSupplierName());
		
			i.add(n);
		}
		return i;
	}

	@Override
	public void deleteInwards(int godownId) {
		inwardsRepository.deleteById(godownId);
		
	}

}
