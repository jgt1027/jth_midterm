package jth_midterm1;

import java.util.List;

public interface SubscDao {
//구독
int addSubsc(Subsc subsc);
//해제
int deleteSubsc(String uesrId,String channelId);
//목록
List<Subsc> listSubscs(String userId);
void deleteSubsc(Subsc subsc);
}