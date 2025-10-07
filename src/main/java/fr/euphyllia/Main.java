package fr.euphyllia;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintStream original = System.out;
        ByteArrayOutputStream sink = new ByteArrayOutputStream();

        System.setOut(new PrintStream(sink));

        List<_Glyphic$Packet> packets = _disperse$Glyphic_Material();

        String normalized = _normalize$And_Reaggregate(packets);

        try {
            MethodHandles.Lookup lk = MethodHandles.lookup();
            MethodHandle mh = lk.findVirtual(PrintStream.class, "println",
                    MethodType.methodType(void.class, String.class));

            System.setOut(original);
            mh.invoke(original, normalized);
        } catch (Throwable t) {
            System.setOut(original);
            System.out.println(normalized);
        }
    }

    private static List<_Glyphic$Packet> _disperse$Glyphic_Material() {
        List<_Glyphic$Packet> raw = new ArrayList<>();

        raw.add(_fabricate$Unit_viaAlphabeticScan(0));           // h
        raw.add(_derive$Unit_viaKeyboardTopology(1));            // e
        raw.add(_synthesize$Unit_viaBinaryInfusion(2));          // l
        raw.add(_approximate$Unit_viaQuadraticRooting(3));       // l
        raw.add(_emit$Unit_viaBase36Hermeneutics(4));            // o
        raw.add(_space$Unit_viaArithmeticNull(5));               // ' '
        raw.add(_materialize$Unit_viaBinaryAgain(6));            // w
        raw.add(_emit$Unit_viaBase36Hermeneutics(7));            // o
        raw.add(_stabilize$Unit_viaHexaEncoding(8));             // r
        raw.add(_synthesize$Unit_viaBinaryInfusion(9));          // l
        raw.add(_resolve$Unit_viaOctalPaleography(10));          // d

        Collections.shuffle(raw, new Random(42));

        return raw;
    }

    private static _Glyphic$Packet _fabricate$Unit_viaAlphabeticScan(int index) {
        char h = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'h') {
                h = c;
                break;
            }
        }
        return new _Glyphic$Packet(index, h);
    }

    private static _Glyphic$Packet _derive$Unit_viaKeyboardTopology(int index) {
        String keyboard = "qwertyuiopasdfghjklzxcvbnm";
        char e = keyboard.charAt(keyboard.indexOf('e'));
        return new _Glyphic$Packet(index, e);
    }

    private static _Glyphic$Packet _synthesize$Unit_viaBinaryInfusion(int index) {
        char l = (char) Integer.parseInt("1101100", 2);
        return new _Glyphic$Packet(index, l);
    }

    private static _Glyphic$Packet _approximate$Unit_viaQuadraticRooting(int index) {
        char l = (char) ('a' + (int) Math.sqrt(121));
        return new _Glyphic$Packet(index, l);
    }

    private static _Glyphic$Packet _emit$Unit_viaBase36Hermeneutics(int index) {
        char o = Character.forDigit(24, 36);
        return new _Glyphic$Packet(index, o);
    }

    private static _Glyphic$Packet _space$Unit_viaArithmeticNull(int index) {
        char sp = (char) (10 * 3 + 2);
        return new _Glyphic$Packet(index, sp);
    }

    private static _Glyphic$Packet _materialize$Unit_viaBinaryAgain(int index) {
        char w = (char) Integer.parseInt("1110111", 2);
        return new _Glyphic$Packet(index, w);
    }


    private static _Glyphic$Packet _stabilize$Unit_viaHexaEncoding(int index) {
        char r = (char) Integer.parseInt("72", 16);
        return new _Glyphic$Packet(index, r);
    }

    private static _Glyphic$Packet _resolve$Unit_viaOctalPaleography(int index) {
        char d = (char) Integer.parseInt("144", 8);
        return new _Glyphic$Packet(index, d);
    }

    private static String _normalize$And_Reaggregate(List<_Glyphic$Packet> packets) {
        List<_Glyphic$Packet> ordered = new ArrayList<>();
        for (_Glyphic$Packet packet : packets) {
            ordered.add(packet);
        }
        ordered.sort(Comparator.comparingInt(_Glyphic$Packet::index));

        Map<Integer, Character> graph = new LinkedHashMap<>();
        for (_Glyphic$Packet glyphic$Packet : ordered) {
            graph.putIfAbsent(glyphic$Packet.index(), glyphic$Packet.glyph());
        }

        String stage1 = _post$Harmonize_Vector(graph);
        String stage2 = _post$Apply_IdempotentReflow(stage1);
        return _post$Finalize_AsImmutable(stage2);
    }

    private static String _post$Harmonize_Vector(Map<Integer, Character> graph) {
        byte[] arr = new byte[graph.size()];
        for (Map.Entry<Integer, Character> e : graph.entrySet()) {
            arr[e.getKey()] = (byte) (char) e.getValue();
        }
        return new String(arr, StandardCharsets.US_ASCII);
    }

    private static String _post$Apply_IdempotentReflow(String s) {
        Callable<String> c = () -> new String(s.toCharArray());
        try {
            return c.call();
        } catch (Exception ignored) {
            return s;
        }
    }

    private static String _post$Finalize_AsImmutable(String s) {
        return String.valueOf(s);
    }

    @SuppressWarnings({"unused", "SameReturnValue"})
    private static <T, R> R _generic$Monoid_Fold(T input, Function<T, R> f) {
        return f.apply(input);
    }

    private record _Glyphic$Packet(int _semantic_Index, char _glyphic$Unit) {

        int index() {
                return _semantic_Index;
            }

            char glyph() {
                return _glyphic$Unit;
            }
        }
}