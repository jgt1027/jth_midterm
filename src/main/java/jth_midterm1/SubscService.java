package jth_midterm1;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;


@Service
public class SubscService {
@Autowired
SubscDao subscDao;
Logger logger =LogManager.getLogger();

public void subscribe() {
	Subsc subsc=new Subsc();
	subsc.setUserId("19");
	subsc.setName("정택환");
	subsc.setChannelId("3");
	subsc.setTitle("데스런");

	try {
		subscDao.addSubsc(subsc);
		logger.debug("구독했습니다.");
	}catch (DuplicateKeyException e) {
		subscDao.deleteSubsc(subsc);
		logger.debug("구독해제 했습니다.");
	}
}
public void listSubsc() {
	List<Subsc> subscriptionList = subscDao.listSubscs("19");
	logger.debug(subscriptionList);
}
}
