package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String key = entry.getKey();

            Set<String> set = result.getOrDefault(key.length(), new HashSet<>());

            set.add(key);

            result.put(key.length(), set);

        }
        return result;
    }
}
