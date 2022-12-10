import java.util.HashMap;

public class CropRatio {
    private final HashMap<String, Integer> crops = new HashMap<>();
    private int totalWeight;

    public static void main(String[] args) {
        CropRatio cropRatio = new CropRatio();

        cropRatio.add("Wheat", 4);
        cropRatio.add("Wheat", 5);
        cropRatio.add("Rice", 1);

        System.out.println("Fraction of wheat: " + cropRatio.proportion("Wheat"));
    }

    public void add(String name, int cropWeight) {
        Integer currentCropWeight = crops.get(name);

        if (currentCropWeight == null) {
            crops.put(name, null);
            totalWeight = cropWeight;
        } else {
            totalWeight = currentCropWeight + cropWeight;
            crops.replace(name, totalWeight);
        }
    }

    public double proportion(String name) {
        try {
            return crops.get(name) / (double) totalWeight;
        } catch (Exception e) {
            return 0;
        }
    }
}
