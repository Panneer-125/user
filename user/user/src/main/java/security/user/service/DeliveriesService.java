package security.user.service;

import java.util.List;

import security.user.model.Deliveries;

public interface DeliveriesService {
Deliveries saveDelivery(Deliveries deliveries);
Deliveries getDelivery(int godownId);
List<Deliveries> getAllDelivery();
void deleteDeliveries(int godownId);

}
