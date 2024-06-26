package NaricesFrias_API.NaricesFrias_API.infrastructure.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
//@AllArgsConstructor
@Data
public class PetDetail {
    public String name;
    public String breed;
    public String gender;
    public String info;
    public String path;
    public String path2;
    public String path3;

    public PetDetail(String name, String breed, String gender, String info, String path, String path2, String path3) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.info = info;
        this.path = path;
        this.path2 = path2;
        this.path3 = path3;
    }

}


