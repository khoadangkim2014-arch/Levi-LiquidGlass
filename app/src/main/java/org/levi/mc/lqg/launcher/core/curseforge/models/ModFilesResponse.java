package org.levi.mc.lqg.core.curseforge.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ModFilesResponse {
    @SerializedName("data")
    public List<ContentFile> data;
}
