package codes.biscuit.skyblockaddons.utils.data.skyblockdata;

import codes.biscuit.skyblockaddons.core.Rarity;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

@Getter
public class OnlineData {

    @SerializedName("bannerImageURL")
    private String bannerImageURL;
    @SerializedName("bannerLink")
    private String bannerLink;
    @SerializedName("updateInfo")
    private UpdateInfo updateInfo;
    @SerializedName("languageJSONFormat")
    private String languageJSONFormat;

    /**
     * This is the list of features in the mod that should be disabled. Features in this list will be disabled for all
     * versions of the mod v1.5.5 and above. The first key in this map is "all". It contains a list of features to be disabled
     * in all mod versions. Version numbers can be added as additional keys to disable features in specific mod versions.
     * An example of this is shown below:
     * <br><br>
     * {@code "1.5.5": [3]}
     * <br><br>
     * Versions must follow the semver format (e.g. {@code 1.6.0}) and cannot be pre-release versions (e.g. {@code 1.6.0-beta.10}).
     * Pre-release versions of the mod adhere to the disabled features list of their release version. For example, the version
     * {@code 1.6.0-beta.10} will adhere to the list with the key {@code 1.6.0}. Disabling features for unique pre-release
     * versions is not supported.
     */
    @SerializedName("disabledFeatures")
    private HashMap<String, List<Integer>> disabledFeatures;
    @SerializedName("dropSettings")
    private DropSettings dropSettings;
    @SerializedName("hypixelBrands")
    private HashSet<Pattern> hypixelBrands;

    @Getter
    public static class UpdateInfo {
        @SerializedName("latestRelease")
        private String latestRelease;
        @SerializedName("releaseDownload")
        private String releaseDownload;
        @SerializedName("releaseChangelog")
        private String releaseChangelog;
        @SerializedName("releaseNote")
        private String releaseNote;
        @SerializedName("latestBeta")
        private String latestBeta;
        @SerializedName("betaDownload")
        private String betaDownload;
        @SerializedName("betaChangelog")
        private String betaChangelog;
        @SerializedName("betaNote")
        private String betaNote;
    }

    @Getter
    public static class DropSettings {
        @SerializedName("minimumInventoryRarity")
        private Rarity minimumInventoryRarity;
        @SerializedName("minimumHotbarRarity")
        private Rarity minimumHotbarRarity;
        @SerializedName("dontDropTheseItems")
        private List<String> dontDropTheseItems;
        @SerializedName("allowDroppingTheseItems")
        private List<String> allowDroppingTheseItems;
    }
}
