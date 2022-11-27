package com.example.iddd_collaboration.common.adapter.persistence.eventsourcing.rocksdb;

import com.example.iddd_collaboration.common.event.EventStore;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class RocksDBEventStore implements EventStore {
    static RocksDBEventStore instance;
    RocksDB rocksDB;

    RocksDBEventStore() throws RocksDBException {
        RocksDB.loadLibrary();

        var options = new Options().setCreateIfMissing(true);
        rocksDB = RocksDB.open(options, "ramfs");
    }

    public static synchronized RocksDBEventStore instance() throws RocksDBException {
        if (instance == null) {
            instance = new RocksDBEventStore();
        }

        return instance;
    }
}