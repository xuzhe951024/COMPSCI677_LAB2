package com.zhexu.cs677_lab2.business.rpcServer.service.raft;

import com.zhexu.cs677_lab2.api.bean.basic.dataEntities.SerializableRaftLogListWrapper;
import com.zhexu.cs677_lab2.api.bean.basic.dataEntities.raftLogMatenance.RaftLogItem;
import com.zhexu.cs677_lab2.api.bean.basic.BasicResponse;

import java.util.List;

/**
 * @project: CS677_LAB2
 * @description:
 * @author: zhexu
 * @create: 12/9/22
 **/
public interface ReceiveSyncDataService {
    BasicResponse receiveData(SerializableRaftLogListWrapper raftLogItemList);
}
