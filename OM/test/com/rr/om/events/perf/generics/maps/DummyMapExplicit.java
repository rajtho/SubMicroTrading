/*******************************************************************************
 * Copyright (c) 2015 Low Latency Trading Limited  :  Author Richard Rose
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at	http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,  software distributed under the License 
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.rr.om.events.perf.generics.maps;

import com.rr.core.lang.ReusableString;
import com.rr.model.generated.internal.events.impl.ClientNewOrderSingleImpl;

/**
 * not real map implementation, just looking at performance 
 * of map type structure using generics
 *
 * @author Richard Rose
 */
public class DummyMapExplicit {
    
    public static class MapEntry {
        ReusableString key;
        ClientNewOrderSingleImpl value;
        
        MapEntry() {
            // nada
        }
        
        ReusableString getReusableStringey()   { return key; }
        ClientNewOrderSingleImpl getClientNewOrderSingleImplalue() { return value; }
        
        void setClientNewOrderSingleImplalue( ClientNewOrderSingleImpl aClientNewOrderSingleImplal ) { value = aClientNewOrderSingleImplal; }
    }
    
    private MapEntry[] _array;

    public DummyMapExplicit( int size ) {
        _array = new MapEntry[ size ];
        
        for( int i=0; i <  size ;i++ ){
            _array[i] = new MapEntry();
        }
    }
    
    public ReusableString getKey( int idx ) {
        return _array[idx].key;
    }

    public ClientNewOrderSingleImpl getClientNewOrderSingleImplalue( int idx ) {
        return _array[idx].value;
    }

    public void set( ReusableString key, ClientNewOrderSingleImpl value, int idx ) {
        MapEntry entry = _array[idx];
        entry.key   = key;
        entry.value = value;
    }
}
