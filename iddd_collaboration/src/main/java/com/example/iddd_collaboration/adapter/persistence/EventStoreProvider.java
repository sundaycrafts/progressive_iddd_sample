package com.example.iddd_collaboration.adapter.persistence;

import com.example.iddd_collaboration.common.adapter.persistence.eventsourcing.rocksdb.RocksDBEventStore;
import com.example.iddd_collaboration.common.event.EventStore;
import org.rocksdb.RocksDBException;

public class EventStoreProvider {
    public EventStore eventStore;
    protected EventStoreProvider () throws RocksDBException {
        initializeRocksDB();
    }

    void initializeRocksDB() throws RocksDBException {
        eventStore = RocksDBEventStore.instance();
    }
}