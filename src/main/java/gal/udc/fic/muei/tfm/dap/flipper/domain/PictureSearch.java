package gal.udc.fic.muei.tfm.dap.flipper.domain;

import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


/**
 * A Picture Search.
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
@Table(name = "pictureSearch")
public class PictureSearch implements Serializable {

    @PartitionKey
    private UUID id;

    @NotNull
    /* 1024px */
    private ByteBuffer pictureFile;

    /* 120px */
    private ByteBuffer littlePictureFile;

    /* begin features */
    private String autocolorCorrelogramAsBase64;
    private List<Double> autocolorCorrelogram;
    private String ceddAsBase64;
    private List<Double> cedd;
    private String colorHistogramAsBase64;
    private List<Double> colorHistogram;
    private String colorLayoutAsBase64;
    private List<Double> colorLayout;
    private String edgeHistogramAsBase64;
    private List<Double> edgeHistogram;
    private String phogAsBase64;
    private List<Double> phog;
    /* end features*/

    private Date created;

    private List<UUID> pictureIdList;

    private String userLogin;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ByteBuffer getPictureFile() {
        return pictureFile;
    }

    public void setPictureFile(ByteBuffer pictureFile) {
        this.pictureFile = pictureFile;
    }

    public ByteBuffer getLittlePictureFile() {
        return littlePictureFile;
    }

    public void setLittlePictureFile(ByteBuffer littlePictureFile) {
        this.littlePictureFile = littlePictureFile;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public List<UUID> getPictureIdList() {
        return pictureIdList;
    }

    public void setPictureIdList(List<UUID> pictureIdList) {
        this.pictureIdList = pictureIdList;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getAutocolorCorrelogramAsBase64() {
        return autocolorCorrelogramAsBase64;
    }

    public void setAutocolorCorrelogramAsBase64(String autocolorCorrelogramAsBase64) {
        this.autocolorCorrelogramAsBase64 = autocolorCorrelogramAsBase64;
    }

    public List<Double> getAutocolorCorrelogram() {
        return autocolorCorrelogram;
    }

    public void setAutocolorCorrelogram(List<Double> autocolorCorrelogram) {
        this.autocolorCorrelogram = autocolorCorrelogram;
    }

    public String getCeddAsBase64() {
        return ceddAsBase64;
    }

    public void setCeddAsBase64(String ceddAsBase64) {
        this.ceddAsBase64 = ceddAsBase64;
    }

    public List<Double> getCedd() {
        return cedd;
    }

    public void setCedd(List<Double> cedd) {
        this.cedd = cedd;
    }

    public String getColorHistogramAsBase64() {
        return colorHistogramAsBase64;
    }

    public void setColorHistogramAsBase64(String colorHistogramAsBase64) {
        this.colorHistogramAsBase64 = colorHistogramAsBase64;
    }

    public List<Double> getColorHistogram() {
        return colorHistogram;
    }

    public void setColorHistogram(List<Double> colorHistogram) {
        this.colorHistogram = colorHistogram;
    }

    public String getColorLayoutAsBase64() {
        return colorLayoutAsBase64;
    }

    public void setColorLayoutAsBase64(String colorLayoutAsBase64) {
        this.colorLayoutAsBase64 = colorLayoutAsBase64;
    }

    public List<Double> getColorLayout() {
        return colorLayout;
    }

    public void setColorLayout(List<Double> colorLayout) {
        this.colorLayout = colorLayout;
    }

    public String getEdgeHistogramAsBase64() {
        return edgeHistogramAsBase64;
    }

    public void setEdgeHistogramAsBase64(String edgeHistogramAsBase64) {
        this.edgeHistogramAsBase64 = edgeHistogramAsBase64;
    }

    public List<Double> getEdgeHistogram() {
        return edgeHistogram;
    }

    public void setEdgeHistogram(List<Double> edgeHistogram) {
        this.edgeHistogram = edgeHistogram;
    }

    public String getPhogAsBase64() {
        return phogAsBase64;
    }

    public void setPhogAsBase64(String phogAsBase64) {
        this.phogAsBase64 = phogAsBase64;
    }

    public List<Double> getPhog() {
        return phog;
    }

    public void setPhog(List<Double> phog) {
        this.phog = phog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PictureSearch pictureSearch = (PictureSearch) o;

        if ( ! Objects.equals(id, pictureSearch.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PictureSearch{" +
                "id=" + id +
                ", created='" + created + "'" +
                ", userLogin='" + userLogin + "'" +
                '}';
    }
}
