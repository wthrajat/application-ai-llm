/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.llm;

import org.xwiki.component.annotation.Component;
import org.xwiki.component.annotation.Role;
import java.util.Map;


@Component
@Role
public interface GPTAPI {
    public String getLLMChatCompletion(Map<String, Object> data, String openAIKey) throws GPTAPIException;
    public String getModels(String token) throws GPTAPIException;
    public GPTAPIConfig getConfig(String id, String currentWiki) throws GPTAPIException;
    public Map<String, GPTAPIConfig> getConfigs(String currentWiki) throws GPTAPIException;
    public GPTAPIPrompt getPrompt(String promptName, String currentWiki) throws GPTAPIException;
    public Boolean isUserAdmin() throws GPTAPIException;
}
