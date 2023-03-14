package BitSets;

public class BitSet8 implements BitSet {
    private byte set = 0;
//
//    @Override
//    public void add(int x) {
//        if (x <= 8) {
//            byte addBit = (byte) ( (byte) 1 << (byte) x);
//            set = (byte) (set & addBit);
//        } else {
//            throw new RuntimeException("LOL, out of range");
//        }
//
//    }
    @Override
    public void add(int value) {
        if (!inRange(value)) {
            throw new RuntimeException("Value " + value + " too large for bit set");
        }
        set |= ((byte) 1 << (byte) value);
    }
    @Override
    public void remove(int x) {
        if (x <= 8) {
            byte removeBit = (byte) ~ ((byte) (0b1 << x));
            set = (byte) (set & removeBit);
        } else {
            throw new RuntimeException("LOL, out of range");
        }

    }

    @Override
    public boolean contains(int x) {
        if (inRange(x)) {
            byte searchBit = (byte) (0b1 << x);
            return (byte) (set & searchBit) != 0;
        } else {
            return false;
        }
    }
//    @Override
//    public boolean contains(int value) {
//        if (!inRange(value)) {
//            return false;
//        }
//        return (((byte) 1 << (byte) value) & set) != 0;
//    }

    @Override
    public void intersectWith(BitSet s) {
        try {
            set = (byte) (((BitSet8) s).set & set);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    @Override
    public int maxStorableValue() {
        return Byte.SIZE;
    }

    public static void main(String[] args) {
        BitSet myByte = new BitSet8();
        myByte.add(0);
        myByte.add(1);
        myByte.remove(2);
        myByte.intersectWith(new BitSet8());
        System.out.println(myByte);
    }

// This has been copied from the answers
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("{ ");
        boolean first = true;
        for (int x = 0; inRange(x); x++) {
            if (contains(x)) {
                if (first) {
                    first = false;
                } else {
                    result.append(", ");
                }
                result.append(x);
            }
        }
        return result + " }";
    }

    private boolean inRange(int x) {
        return x >= 0 && x < maxStorableValue();
    }

}

