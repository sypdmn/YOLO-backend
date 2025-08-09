/**
 * AdoptionService接口的实现类，用于管理宠物领养。
 * 此类处理管理宠物、领养人和领养的所有业务逻辑。
 */
package com.petadoption.impl;

import com.petadoption.entities.*;
import com.petadoption.services.AdoptionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AdoptionService接口的主要实现。
 * 使用内存存储来存储宠物、领养人和领养记录。
 */
public class AdoptionServiceImpl implements AdoptionService {
    /** 通过ID存储所有宠物的映射 */
    private Map<Integer, Pet> pets;
    /** 通过ID存储所有领养人的映射 */
    private Map<Integer, Adopter> adopters;
    /** 存储所有领养记录的列表 */
    private List<AdoptionRecord> adoptionRecords;
    /** 下一个可用的宠物ID */
    private int nextPetId;
    /** 下一个可用的领养人ID */
    private int nextAdopterId;
    /** 下一个可用的领养记录ID */
    private int nextRecordId;

    /**
     * 构造函数初始化数据结构和ID计数器。
     */
    public AdoptionServiceImpl() {
        pets = new HashMap<>();
        adopters = new HashMap<>();
        adoptionRecords = new ArrayList<>();
        nextPetId = 1;
        nextAdopterId = 1;
        nextRecordId = 1;
    }

    // TODO: 实现领养记录管理相关方法
    // 提示：使用MyBatis进行数据库操作
     * 获取特定领养人的领养记录。
     * @param adopterId 领养人的ID
     * @return 该领养人的领养记录列表
     */
    @Override
    public List<AdoptionRecord> getAdoptionRecordsByAdopter(int adopterId) {
        List<AdoptionRecord> records = new ArrayList<>();
        for (AdoptionRecord record : adoptionRecords) {
            if (record.getAdopter().getId() == adopterId) {
                records.add(record);
            }
        }
        return records;
    }
}
