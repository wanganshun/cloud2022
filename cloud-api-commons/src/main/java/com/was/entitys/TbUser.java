package com.was.entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author 王安顺
 * @since 2022-08-10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbUser implements Serializable {
    private Integer id;
    private String name;
    private String idcard;
    private String phone;





}

