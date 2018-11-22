package com.CodeHeap.Collections.playingWithMaps01;

import com.CodeHeap.Collections.MapData.MapData;
import com.CodeHeap.Collections.MapData.Pair;
import com.CodeHeap.arrays.CountingGenerator.CountingGenerator;
import com.CodeHeap.arrays.CountingGenerator.Generator;
import com.CodeHeap.arrays.CountingGenerator.RandomGenerator;

import java.util.Map;

public class MapDataTest {
    public static void main(String[] args) {

        Map<Integer, String> map = MapData.map(new Generator<Pair<Integer, String>>() {
            RandomGenerator.Integer randInt = new RandomGenerator.Integer();
            RandomGenerator.String randString = new RandomGenerator.String(8);
            @Override
            public Pair<Integer, String> next() {
                return new Pair<>(randInt.next(), randString.next());
            }
        }, 10);
        System.out.println(map);
        MapData<Character, Integer> map2 = MapData.map(new RandomGenerator.Character(), new RandomGenerator.Integer(), 10);
        System.out.println(map2);
        System.out.println(MapData.map(new CountingGenerator.Character(), "value", 10));

    }
}
