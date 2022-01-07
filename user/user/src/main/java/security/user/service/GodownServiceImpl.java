package security.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import security.user.entity.GodownEntity;
import security.user.model.Godown;
import security.user.repository.GodownRepository;
@Service
public class GodownServiceImpl implements GodownService {
@Autowired
public GodownRepository godownRepository;
	@Override
	public Godown saveGodowns(Godown godown) {
		GodownEntity g=new GodownEntity();
		g.setGodownlocation(godown.getGodownlocation());
		g.setCapacityquintals(godown.getCapacityquintals());
		g.setGodownmanager(godown.getGodownmanager());
		g.setStartdate(godown.getStartdate());
		godownRepository.save(g);
		return godown;
	}

	@Override
	public Godown getGodown(int id) {
		GodownEntity e = godownRepository.getById(id);
		Godown g=new Godown();
		g.setGodownlocation(e.getGodownlocation());
		g.setCapacityquintals(e.getCapacityquintals());
		g.setGodownmanager(e.getGodownmanager());
		g.setStartdate(e.getStartdate());
		return g;
	}

	@Override
	public void deleteGodown(int godownid) {
		godownRepository.deleteById(godownid);

		
	}

}
