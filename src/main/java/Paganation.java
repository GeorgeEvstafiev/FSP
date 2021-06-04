import java.util.ArrayList;

public class Paganation {

    public Paganation(){
    }

    public static <T> ArrayList<ArrayList<T>> toChunk(ArrayList<T> list, int chunkSize){
        ArrayList<ArrayList<T>> chunks = new ArrayList<>();

        for (int i = 0; i < list.size(); i += chunkSize) {
            ArrayList<T> chunk = new ArrayList<>(list.subList(i, Math.min(list.size(), i + chunkSize)));
            chunks.add(chunk);
        }

        return chunks;
    }
}
