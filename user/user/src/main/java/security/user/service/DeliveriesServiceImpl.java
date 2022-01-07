package security.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.DeliveriesEntity;
import security.user.model.Deliveries;
import security.user.repository.DeliveriesRepository;
@Service
public class DeliveriesServiceImpl implements DeliveriesService {
	
@Autowired
DeliveriesRepository deliveriesRepository;
	@Override
	public Deliveries saveDelivery(Deliveries deliveries) {
		DeliveriesEntity d=new DeliveriesEntity();
		d.setGodownId(deliveries.getGodownId());
		d.setItemName(deliveries.getItemName());
		d.setInvoiceNo(deliveries.getInvoiceNo());
		d.setSupplyDate(deliveries.getSupplyDate());
		d.setDeliveryDate(deliveries.getDeliveryDate());
        d.setDeliveredTo(deliveries.getDeliveredTo());
        d.setPurpose(deliveries.getPurpose());
        d.setReceiptNo(deliveries.getReceiptNo());
        d.setBillValue(deliveries.getBillValue());
        d.setQuantity(deliveries.getQuantity());
        deliveriesRepository.save(d);
		return deliveries;
	}

	@Override
	public Deliveries getDelivery(int godownId) {
		DeliveriesEntity g=deliveriesRepository.getById(godownId);
		Deliveries d=new Deliveries();
		d.setGodownId(g.getGodownId());
		d.setItemName(g.getItemName());
		d.setInvoiceNo(g.getInvoiceNo());
		d.setSupplyDate(g.getSupplyDate());
		d.setDeliveryDate(g.getDeliveryDate());
        d.setDeliveredTo(g.getDeliveredTo());
        d.setPurpose(g.getPurpose());
        d.setReceiptNo(g.getReceiptNo());
        d.setBillValue(g.getBillValue());
        d.setQuantity(g.getQuantity());
		return d;
	}

	@Override
	public List<Deliveries> getAllDelivery() {
		List<Deliveries> i=new ArrayList<Deliveries>();
		List<DeliveriesEntity>e=deliveriesRepository.findAll();
		Deliveries d=new Deliveries();
		for(DeliveriesEntity deliveriesEntity:e) {
			d.setGodownId(deliveriesEntity.getGodownId());
			d.setItemName(deliveriesEntity.getItemName());
			d.setInvoiceNo(deliveriesEntity.getInvoiceNo());
			d.setSupplyDate(deliveriesEntity.getSupplyDate());
			d.setDeliveryDate(deliveriesEntity.getDeliveryDate());
	        d.setDeliveredTo(deliveriesEntity.getDeliveredTo());
	        d.setPurpose(deliveriesEntity.getPurpose());
	        d.setReceiptNo(deliveriesEntity.getReceiptNo());
	        d.setBillValue(deliveriesEntity.getBillValue());
	        d.setQuantity(deliveriesEntity.getQuantity());
		
	        i.add(d);
		}
		return i;
	}

	@Override
	public void deleteDeliveries(int godownId) {
		deliveriesRepository.deleteById(godownId);
		
	}

}
