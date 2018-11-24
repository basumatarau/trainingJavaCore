package com.CodeHeap.Collections.SimpleHashMap;

import java.util.Map;

public class MapEntry<Key, Val> implements Map.Entry<Key, Val> {
    private Key key;
    private Val value;

    MapEntry(Key key, Val value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Key getKey() {
        return key;
    }

    @Override
    public Val getValue() {
        return value;
    }

    @Override
    public Val setValue(Val v) {
        this.value = v;
        return value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        MapEntry entry = (MapEntry) o;
        return (key == null ? entry.getKey() == null : key.equals(entry.getKey())) &&
                (value == null ? entry.getValue() == null : value.equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }
}
