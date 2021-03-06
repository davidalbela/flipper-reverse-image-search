package gal.udc.fic.muei.tfm.dap.flipper.web.rest.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the PictureSearch entity.
 *
 * This file is part of Flipper Open Reverse Image Search.

 Flipper Open Reverse Image Search is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Flipper Open Reverse Image Search is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Flipper Open Reverse Image Search.  If not, see <http://www.gnu.org/licenses/>.
 */
public class PictureSearchCreateDTO implements Serializable {

    @NotNull
    private byte[] pictureFile;

    public byte[] getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(byte[] pictureFile) {
        this.pictureFile = pictureFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PictureSearchCreateDTO pictureSearchDTO = (PictureSearchCreateDTO) o;

        if ( ! Objects.equals(pictureFile, pictureSearchDTO.pictureFile)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pictureFile);
    }

    @Override
    public String toString() {
        return "PictureSearchDTO{" +
                ", pictureFile length='" + pictureFile.length + "'" +
                '}';
    }
}
