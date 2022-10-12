import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        AtomicInteger idx = new AtomicInteger();
        IntStream.range(0, n).forEach((y) -> {
            IntStream.range(0, m).forEach((x) -> {
                idx.getAndIncrement();
                sb.append(idx.get()).append(" ");
            });
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        });
        System.out.print(sb);
    }
}