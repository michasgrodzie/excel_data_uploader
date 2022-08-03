package com.michal.excel_data_uploader.entitys;


import com.michal.excel_data_uploader.utils.WarehouseType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "palety")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Paleta {

    @Id
    private String palHu;

    @Column(name = "PALIN_DAY")
    @Temporal(TemporalType.DATE)
    private Date incomingDay;

    @Column(name="PALIN_TIME")
    @Temporal(TemporalType.TIME)
    private Date incomingHour;

    @Column(name = "WAREHOUSE")
    @Enumerated(value = EnumType.STRING)
    private WarehouseType warehouseType;



}
