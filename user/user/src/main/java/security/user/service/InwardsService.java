package security.user.service;

import java.util.List;

import security.user.model.Inwards;

public interface InwardsService {
Inwards saveInwards(Inwards inwards);
Inwards getInwards(int godownId);
List<Inwards> getAllInwards();
void deleteInwards(int godownId);
}
