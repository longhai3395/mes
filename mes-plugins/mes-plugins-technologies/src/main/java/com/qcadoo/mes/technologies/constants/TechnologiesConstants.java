/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo MES
 * Version: 1.4
 *
 * This file is part of Qcadoo.
 *
 * Qcadoo is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */
package com.qcadoo.mes.technologies.constants;

public final class TechnologiesConstants {

    private TechnologiesConstants() {
    }

    public static final String PLUGIN_IDENTIFIER = "technologies";

    // MODEL

    public static final String MODEL_OPERATION = "operation";

    public static final String MODEL_OPERATION_PRODUCT_IN_COMPONENT = "operationProductInComponent";

    public static final String MODEL_OPERATION_PRODUCT_IN_COMPONENT_DTO = "operationProductInComponentDto";

    public static final String MODEL_OPERATION_PRODUCT_OUT_COMPONENT = "operationProductOutComponent";

    public static final String MODEL_TECHNOLOGY = "technology";

    public static final String MODEL_TECHNOLOGY_OPERATION_COMPONENT = "technologyOperationComponent";

    public static final String MODEL_OPERATION_NUMBER_FIELD_NAME = "number";

    public static final String MODEL_TECHNOLOGY_STATE_CHANGE = "technologyStateChange";

    public static final String MODEL_TECHNOLOGY_GROUP = "technologyGroup";

    public static final String MODEL_TECHNOLOGY_ATTACHMENT = "technologyAttachment";

    public static final String MODEL_BARCODE_OPERATION_COMPONENT = "barcodeOperationComponent";

    public static final String MODEL_PRODUCT_STRUCTURE_TREE_NODE = "productStructureTreeNode";

    public static final String MODEL_TECHNOLOGY_OPERATION_COMPONENT_MERGE_PRODUCT_IN = "technologyOperationComponentMergeProductIn";

    public static final String MODEL_TECHNOLOGY_OPERATION_COMPONENT_MERGE_PRODUCT_OUT = "technologyOperationComponentMergeProductOut";

    public static final String OPERATION_COMPONENTS = "operationComponents";

    public static final String OPERATION_SKILL = "operationSkill";

    public static final String MODIFY_TECHNOLOGY_HELPER = "modifyTechnologyHelper";

    // VIEW

    public static final String VIEW_OPERATION_DETAILS = "operationDetails";

    public static final String VIEW_OPERATION_PRODUCT_IN_COMPONENT_DETAILS = "operationProductInComponentDetails";

    public static final String VIEW_OPERATION_PRODUCT_OUT_COMPONENT_DETAILS = "operationProductOutComponentDetails";

    public static final String VIEW_OPERATIONS_LIST = "operationsList";

    public static final String VIEW_TECHNOLOGIES_LIST = "technologiesList";

    public static final String VIEW_TECHNOLOGY_DETAILS = "technologyDetails";

    public static final String VIEW_TECHNOLOGY_OPERATION_COMPONENT_DETAILS = "technologyOperationComponentDetails";

}
