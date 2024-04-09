package com.telran.prof.lesson_5;

import java.util.*;

public class BigUniqueRng implements Iterator<Integer> {
        private Random random = new Random();
        private Set<Integer> generated = new LinkedHashSet<>();

        public BigUniqueRng(int size, int max) {
            while (generated.size() < size) {
                Integer next = random.nextInt(max);
                generated.add(next);
            }
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<Integer> iterator = generated.iterator();
            Integer next = iterator.next();
            iterator.remove();
            return next;
        }

        @Override
        public boolean hasNext() {
            return !generated.isEmpty();
        }
    }
}
