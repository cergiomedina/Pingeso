/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author seerg
 */
@Entity
public class pensionado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long rut_pensionado;
    private String nombre_pensionado;
    private String apellido_p_pensionado;
    private String apellido_m_pensionado;
    private String fecha_nacimiento;
    private String estado_civil;
    private String direccion;
    private String comuna;
    private String region;
    private Long telefono_fijo;
    private Long celular;

    public Long getRut_pensionado() {
        return rut_pensionado;
    }

    public void setRut_pensionado(Long rut_pensionado) {
        this.rut_pensionado = rut_pensionado;
    }

    public String getNombre_pensionado() {
        return nombre_pensionado;
    }

    public void setNombre_pensionado(String nombre_pensionado) {
        this.nombre_pensionado = nombre_pensionado;
    }

    public String getApellido_p_pensionado() {
        return apellido_p_pensionado;
    }

    public void setApellido_p_pensionado(String apellido_p_pensionado) {
        this.apellido_p_pensionado = apellido_p_pensionado;
    }

    public String getApellido_m_pensionado() {
        return apellido_m_pensionado;
    }

    public void setApellido_m_pensionado(String apellido_m_pensionado) {
        this.apellido_m_pensionado = apellido_m_pensionado;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

   

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Long getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(Long telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof pensionado)) {
            return false;
        }
        pensionado other = (pensionado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.pensionado[ id=" + id + " ]";
    }
    
}
