package security.user.service;

import security.user.model.Godown;
public interface GodownService {
	Godown saveGodowns(Godown godown);
    Godown getGodown(int id);
	void deleteGodown(int godownid);

}
