import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Paganation {

    public Paganation(){
    }

    @NotNull
    public static <T> ArrayList<ArrayList<T>> toChunk(@NotNull ArrayList<T> list, int chunkSize){
        ArrayList<ArrayList<T>> chunks = new ArrayList<>();

        for (int i = 0; i < list.size(); i += chunkSize) {
            ArrayList<T> chunk = new ArrayList<>(list.subList(i, Math.min(list.size(), i + chunkSize)));
            chunks.add(chunk);
        }
        return chunks;
    }

    public static <T> ArrayList<ArrayList<T>> getListOfPaganation(ArrayList<T> aCollection, int aSizePage) {

        ArrayList<ArrayList<T>> result = new ArrayList<>();
        if(aCollection != null) {
            if(aCollection.size() < aSizePage) {
                result.add(aCollection);
                return result;
            }
            else {
                if(aCollection.size() > aSizePage) {
                    result = toChunk(aCollection, aSizePage);
                }
            }
        }
        return result;
    }
}
