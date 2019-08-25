Aug 25, 2019 8:36:28 PM com.hazelcast.config.XmlConfigLocator
INFO: Loading 'hazelcast.xml' from classpath.
Aug 25, 2019 8:36:28 PM com.hazelcast.config.AbstractXmlConfigHelper
WARNING: Name of the hazelcast schema location incorrect using default
Aug 25, 2019 8:36:29 PM com.hazelcast.instance.DefaultAddressPicker
INFO: [LOCAL] [MyCluster] [3.7.1] Interfaces is disabled, trying to pick one address from TCP-IP config addresses: [127.0.0.1]
Aug 25, 2019 8:36:29 PM com.hazelcast.instance.DefaultAddressPicker
INFO: [LOCAL] [MyCluster] [3.7.1] Picked [127.0.0.1]:5701, using socket ServerSocket[addr=/0:0:0:0:0:0:0:0,localport=5701], bind any local is true
Aug 25, 2019 8:36:29 PM com.hazelcast.system
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Hazelcast 3.7.1 (20160905 - 1f47990) starting at [127.0.0.1]:5701
Aug 25, 2019 8:36:29 PM com.hazelcast.system
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
Aug 25, 2019 8:36:29 PM com.hazelcast.system
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Configured Hazelcast Serialization version : 1
Aug 25, 2019 8:36:29 PM com.hazelcast.spi.impl.operationservice.impl.BackpressureRegulator
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Backpressure is disabled
Aug 25, 2019 8:36:30 PM com.hazelcast.instance.Node
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Creating TcpIpJoiner
Aug 25, 2019 8:36:30 PM com.hazelcast.core.LifecycleService
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] [127.0.0.1]:5701 is STARTING
Aug 25, 2019 8:36:30 PM com.hazelcast.spi.impl.operationexecutor.impl.OperationExecutorImpl
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Starting 8 partition threads
Aug 25, 2019 8:36:30 PM com.hazelcast.spi.impl.operationexecutor.impl.OperationExecutorImpl
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Starting 5 generic threads (1 dedicated for priority tasks)
Aug 25, 2019 8:36:30 PM com.hazelcast.nio.tcp.nonblocking.NonBlockingIOThreadingModel
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] TcpIpConnectionManager configured with Non Blocking IO-threading model: 3 input threads and 3 output threads
Aug 25, 2019 8:36:30 PM com.hazelcast.nio.tcp.InitConnectionTask
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Connecting to /127.0.0.1:5703, timeout: 0, bind-any: true
Aug 25, 2019 8:36:30 PM com.hazelcast.nio.tcp.InitConnectionTask
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Connecting to /127.0.0.1:5702, timeout: 0, bind-any: true
Aug 25, 2019 8:36:31 PM com.hazelcast.nio.tcp.InitConnectionTask
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Could not connect to: /127.0.0.1:5703. Reason: SocketException[Connection refused: connect to address /127.0.0.1:5703]
Aug 25, 2019 8:36:31 PM com.hazelcast.cluster.impl.TcpIpJoiner
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] [127.0.0.1]:5703 is added to the blacklist.
Aug 25, 2019 8:36:31 PM com.hazelcast.nio.tcp.InitConnectionTask
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Could not connect to: /127.0.0.1:5702. Reason: SocketException[Connection refused: connect to address /127.0.0.1:5702]
Aug 25, 2019 8:36:31 PM com.hazelcast.cluster.impl.TcpIpJoiner
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] [127.0.0.1]:5702 is added to the blacklist.
Aug 25, 2019 8:36:32 PM com.hazelcast.cluster.impl.TcpIpJoiner
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] 


Members [1] {
	Member [127.0.0.1]:5701 - fc797994-4103-4099-8b97-3bbcfe332248 this
}

Aug 25, 2019 8:36:32 PM com.hazelcast.core.LifecycleService
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] [127.0.0.1]:5701 is STARTED
Aug 25, 2019 8:36:32 PM com.hazelcast.internal.partition.impl.PartitionStateManager
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Initializing cluster partition table arrangement...
Known capital cities: 4
Aug 25, 2019 8:37:32 PM com.hazelcast.nio.tcp.SocketAcceptorThread
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Accepting socket connection from /127.0.0.1:52523
Aug 25, 2019 8:37:32 PM com.hazelcast.nio.tcp.TcpIpConnectionManager
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Established socket connection between /127.0.0.1:5701 and /127.0.0.1:52523
Aug 25, 2019 8:37:39 PM com.hazelcast.internal.cluster.ClusterService
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] 

Members [2] {
	Member [127.0.0.1]:5701 - fc797994-4103-4099-8b97-3bbcfe332248 this
	Member [127.0.0.1]:5702 - 217dc291-56f7-4e0b-abc5-43f22461a4bf
}

Aug 25, 2019 8:37:40 PM com.hazelcast.internal.partition.impl.MigrationManager
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] Re-partitioning cluster data... Migration queue size: 271
Aug 25, 2019 8:37:42 PM com.hazelcast.internal.partition.impl.MigrationThread
INFO: [127.0.0.1]:5701 [MyCluster] [3.7.1] All migration tasks have been completed, queues are empty.
