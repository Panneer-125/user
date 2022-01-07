package security.user.service;

import java.util.List;

import security.user.model.Return;

public interface ReturnService {
Return saveReturn(Return returns);
Return getReturn(int godownId);
List<Return> getAllReturn();
void deleteReturn(int godownId);

}
